package 通讯录;

import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class FileOperation {
	/**
	 * 将指定的字符串写入指定的文件中去
	 * @param contactInfor
	 * @param filePath
	 * @return
	 */
	public static boolean saveContact(String contactInfor,String filePath){
		File file=new File(filePath);
		try {
			FileWriter fw=new FileWriter(file,true);
			fw.write(contactInfor+"\n");
			fw.flush();
			fw.close();
			return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	/**
	 * 删除保存联系人的文件并创建一个与之同名的空文件
	 */
	public static void remove(){
		File file=new File("files/contact.txt");
		if(file.exists())
			if(file.isFile()){
				file.delete();
				JOptionPane.showMessageDialog(null, "成功清空所有联系人！！！！");
			}
		if(!file.exists())
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	/**
	 * 根据给定的文件路径将文件中的内容以contact对象的形式保存在列表中
	 * @param filePath
	 * @return
	 */
	public static ArrayList <Contact>getContacts(String filePath){
  	   ArrayList <Contact>contacts=new ArrayList<Contact>();
  	   File file=new File(filePath);
  	   try{
  		   BufferedReader br=new BufferedReader(new FileReader(file));
  		   String data=null;
  		   while ((data=br.readLine())!=null) {
  			  if(!data.equals("")){
  				  Contact contact=new Contact();
  				  String[] infor=data.split("##");
  				  contact.setNum(infor[0]);
  				  contact.setName(infor[1]);  
  				  contact.setPhoneNumber(infor[2]);  
  				  contact.setEmailAddress(infor[3]);   
  				  contact.setAddress(infor[4]);  
  				  contact.setSex(infor[5]);     
  				  contact.setRelationship(infor[6]);  
  				  contacts.add(contact);  
  			  }
  		   }
  		   return contacts;
  		   }catch (FileNotFoundException e){
  			// TODO Auto-generated catch block  
  			   e.printStackTrace();
  				return null;
  		   }catch(IOException e){
  			// TODO Auto-generated catch block  
  			   e.printStackTrace();
 				return null;
  		   }
  	}
	/**
	 * 根据指定姓名在文件中查找符合的联系人并将其保存在列表中
	 * @param name
	 * @return
	 */
	public static ArrayList<Contact> getReferContacts(String name){
  	   ArrayList<Contact> al=new ArrayList<Contact>();
  	   ArrayList<Contact> information=getContacts("files/contact.txt");
  	   for(int i=0;i<information.size();i++)
  		   if(information.get(i).getName().equals(name))
  			   al.add(information.get(i));
  	   
  	   return al;
    }
	/**
	 * 将一个文件内容写到另一个文件中
	 * @param contactInfo
	 * @param filePath
	 * @return 是否成功的状态
	 */
	public static boolean saveContact(ArrayList <Contact>contactInfo,String filePath){
		File file=new File(filePath);
		FileWriter fw=null;
		try{
			fw=new FileWriter(file);
			for(int i=0;i<contactInfo.size();i++){
				Contact contact=contactInfo.get(i);
				String  contactStr=contact.toString();
				fw.write(contactStr+"\n");
				}
			fw.close();
		return true;
		}catch (IOException e){
			// TODO Auto-generated catch block  
			e.printStackTrace();
				return false;
		}
	}
}
