package seedu.manager;

import ui.Ui;

public class Main {
    private static final Ui ui = new Ui();

    /**
     * Main entry-point for the EventManagerCLI application.
     */
    public static void main(String[] args) {
        ui.greetUser();
    }
}
