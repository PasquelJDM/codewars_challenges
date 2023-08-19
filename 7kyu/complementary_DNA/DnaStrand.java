public class DnaStrand {
    public static String makeComplement(String dna) {
        return dna.replaceAll("A", "S")
                .replaceAll("G", "H")
                .replaceAll("T", "A")
                .replaceAll("C", "G")
                .replaceAll("S", "T")
                .replaceAll("H", "C");
    }
}