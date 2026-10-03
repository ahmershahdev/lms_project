package com.hitms.lab01;

import static org.fusesource.jansi.Ansi.Color.GREEN;
import static org.fusesource.jansi.Ansi.ansi;

import org.fusesource.jansi.AnsiConsole;

/**
 * Lab 01 - uses the Jansi library to print coloured console output.
 */
public class Colors {

    /**
     * Prints a greeting in green text.
     *
     * @param args command-line arguments (unused)
     */
    public static void main(String[] args) {
        AnsiConsole.systemInstall();
        System.out.println(ansi().fg(GREEN).a("Hello, Software Construction!").reset());
        AnsiConsole.systemUninstall();
    }
}
