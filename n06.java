import java.util.Scanner;
import java.io.*;

public class n06 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("��ü ��θ��� �ƴ� ���� �̸��� �Է��ϴ� ���, ������ ������Ʈ ������ �־�� �մϴ�.");
		System.out.print("ù��° ���� �̸��� �Է��ϼ���>>");
		String f1 = scanner.nextLine();
		
		System.out.print("�ι�° ���� �̸��� �Է��ϼ���>>");
		String f2 = scanner.nextLine();
		int c;
		try {
			FileReader fr= new FileReader(f1);
			FileWriter fw= new FileWriter("appended.txt");
			while((c = fr.read()) != -1) {
				fw.write((char)c);
			}
			fr.close();
			
			fr = new FileReader(f2); // �ι�° ����
			while((c = fr.read()) != -1) {
				fw.write((char)c);
			}
			fr.close();
			fw.close();
			System.out.println("������Ʈ ���� �ؿ� appended.txt ���Ͽ� �����Ͽ����ϴ�.");			
		} catch (IOException e) {
			System.out.println("����� ����");
		}
		scanner.close();
	}
}
