package by.boiko.crm.service.impl.ParserMail;

public class MigomParser {

    public Migom parser(String[] lines) {
        Migom migom = new Migom();
        for (int i = 0; i < lines.length; i++) {
            if (lines[i].contains("Заказ №")){
                String[] strings = lines[i].split("href");
                String[] str = strings[1].split(">");
                String result = str[0].substring(2).replace("\"", "");
                migom.setUrl(result);
            }
            if (lines[i].contains("tel:")) {
                String[] strings = lines[i].split(">");
                String result = strings[1].substring(4, strings[1].length() - 3);
                StringBuilder sb = new StringBuilder(result);
                sb.insert(2," ");
                migom.setPhoneNumber(sb.toString());
            }
            if (lines[i].contains("Покупатель")) {
                String str = lines[i + 6].replaceAll("[^А-Яа-я]", "");
                migom.setName(str);
            }
        }

        return migom;
    }
}
