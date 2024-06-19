public class AdapterPatternDemo {
    public static void main(String[] args) {
        Pen pen = new Pen();
        Tablet adapter = new PenToTabletAdapter(pen);

        // Using the adapter to make the pen compatible with the tablet interface
        String assignmentText = "This is my school assignment.";
        adapter.typeText(assignmentText);
    }
}

