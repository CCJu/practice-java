
import javax.swing.table.*;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.*;
@SuppressWarnings("serial")
public class ArrayCreateTable extends JFrame {
	private JTable table=null;
	private JPanel jp=new JPanel();
 
	private JTable getTable(){
		if(table==null){
			table=new JTable();
			String[] columns={"ID","姓名","性别","邮箱","电话","备注"};
			int[] columnWidth={50,40,30,60,70,70};
			DefaultTableModel model=new DefaultTableModel(columns,8);
			table.setModel(model);
			TableColumnModel columnModel=table.getColumnModel();
			int count=columnModel.getColumnCount();
			for(int i=0;i<count;i++){
				javax.swing.table.TableColumn column=columnModel.getColumn(i);
				column.setPreferredWidth(columnWidth[i]);
			}
		}
		return table;
	}
	private void showWindow(){
		this.getTable();
		JTableHeader  myt=table.getTableHeader();
		jp.add(myt,BorderLayout.NORTH);
		jp.add(table,BorderLayout.CENTER);
		this.add(jp);
		this.setTitle("表格实例");
		this.setBounds(100, 100,330, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setResizable(false);
	}
	public static void main(String[] args) {
		ArrayCreateTable aa=new ArrayCreateTable();
		aa.showWindow();
	}
}
