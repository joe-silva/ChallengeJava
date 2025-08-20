public record Rates(double conversion_result) {
    @Override
    public String toString() {
        return String.valueOf(conversion_result());
    }
}
