package com.nicetech.optimus.utils;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public final class TextTransfer implements ClipboardOwner {

    /**
     * Empty implementation of the ClipboardOwner interface.
     * @param aClipboard
     * @param aContents
     */
    @Override
    public void lostOwnership(Clipboard aClipboard, Transferable aContents) {
        //do nothing
    }

    /**
     * Place a String on the clipboard, and make this class the owner of the
     * Clipboard's contents.
     * @param aString
     */
    public void setClipboardContents(String aString) {
        StringSelection stringSelection = new StringSelection(aString);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, this);
    }

    /**
     * Get the String residing on the clipboard.
     *
     * @return any text found on the Clipboard; if none found, return an empty
     * String.
     * @throws java.awt.datatransfer.UnsupportedFlavorException
     */
    public String getClipboardContents() throws UnsupportedFlavorException {
        String result = "";
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        //odd: the Object param of getContents is not currently used
        Transferable contents = clipboard.getContents(null);
        boolean hasTransferableText
                = (contents != null)
                && contents.isDataFlavorSupported(DataFlavor.stringFlavor);
        if (hasTransferableText) {
            try {
                result = (String) contents.getTransferData(DataFlavor.stringFlavor);
            } catch (IOException ex) {

            }
        }
        return result;
    }

}
