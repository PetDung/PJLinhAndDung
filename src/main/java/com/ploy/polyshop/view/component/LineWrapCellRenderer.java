
package com.ploy.polyshop.view.component;

import java.awt.Component;
import javax.swing.BorderFactory;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableCellRenderer;

public class LineWrapCellRenderer extends DefaultTableCellRenderer {
        private JTextArea textArea;

        public LineWrapCellRenderer() {
            textArea = new JTextArea();
            textArea.setLineWrap(true);
            textArea.setWrapStyleWord(true);
            textArea.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
        }

        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            if (isSelected) {
                textArea.setForeground(table.getSelectionForeground());
                textArea.setBackground(table.getSelectionBackground());
            } else {
                textArea.setForeground(table.getForeground());
                textArea.setBackground(table.getBackground());
            }

            textArea.setText((String) value);
            return textArea;
        }
}
