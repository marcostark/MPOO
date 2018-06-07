package estudoslayout.demo1;

import javax.swing.table.AbstractTableModel;

public class NegociosTableModel extends AbstractTableModel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public int getRowCount() {
		return 40;
	}

	@Override
	public int getColumnCount() {
		return 3;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		return null;
	}

	// Sobreescrevendo o metodo que muda o nome das colunas
	@Override
	public String getColumnName(int column) {
		switch (column) {
		case 0:
			return "Coluna 1";
		case 1:
			return "Coluna 2";
		case 2:
			return "Coluna 3";
		}
		return "";
	}
}
