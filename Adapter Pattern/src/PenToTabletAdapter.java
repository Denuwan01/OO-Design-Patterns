// Adapter to make Pen compatible with Tablet interface
class PenToTabletAdapter extends Tablet {
    private Pen pen;

    public PenToTabletAdapter(Pen pen) {
        this.pen = pen;
    }

    @Override
    public void typeText(String text) {
        pen.write(text);
    }
}
