public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    private String formatMascaraCpfCnpj(String cpfCnpj) {
        String cpfCnpjFormatado;
        if (cpfCnpj.length() > 11) {
            cpfCnpjFormatado = cpfCnpj.replaceAll("(\\d{2})(\\d{3})(\\d{3})(\\d{4})(\\d{2})", "$1.$2.$3/$4-$5");
        } else if (cpfCnpj.length() == 11) {
            cpfCnpjFormatado = cpfCnpj.replaceAll("(\\d{3})(\\d{3})(\\d{3})(\\d{2})", "$1.$2.$3-$4");
        } else {
            return cpfCnpj;
        }

        return cpfCnpjFormatado;
    }
}
