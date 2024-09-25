public enum Location {
    AEROPORTO(5, 18), 
    ESTACAO_TREM(12, 8), 
    SHOPPING(20, 7), 
    ESCOLA(6, 23), 
    PARQUE(0, 4), 
    HOSPITAL(15, 11), 
    BIBLIOTECA(3, 19), 
    ESTADIO(22, 25);

    private final int x;
    private final int y;

    Location(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return this.name() + " (" + x + ", " + y + ")";
    }
}
