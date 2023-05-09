package utils;

public class CpfCnpjUtil {

    public static String formatMascaraCpfCnpj(String cpfCnpj) {
        String cpfCnpjFormatado;
        if(cpfCnpj != null && !cpfCnpj.trim().isEmpty()) {
            if(cpfCnpj.matches("\\d{2}.\\d{3}.\\d{3}/\\d{4}.\\d{2}") || cpfCnpj.matches("\\d{3}.\\d{3}.\\d{3}-\\d{2}")) {
                cpfCnpjFormatado = cpfCnpj;
            } else if(cpfCnpj.length() > 11) {
                cpfCnpjFormatado = cpfCnpj.replaceAll("(\\d{2})(\\d{3})(\\d{3})(\\d{4})(\\d{2})", "$1.$2.$3/$4-$5");
            } else if (cpfCnpj.length() == 11){
                cpfCnpjFormatado = cpfCnpj.replaceAll("(\\d{3})(\\d{3})(\\d{3})(\\d{2})", "$1.$2.$3-$4");
            } else {
                cpfCnpjFormatado = cpfCnpj.replaceAll("(\\d{2})(\\d{3})(\\d{3})", "$1.$2.$3");
            }
        } else {
            cpfCnpjFormatado = cpfCnpj;
        }

        return cpfCnpjFormatado;
    }
}
