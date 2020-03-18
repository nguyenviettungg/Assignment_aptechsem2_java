package article.test;

import java.util.ArrayList;
import java.util.Scanner;

import model.Article;



public class MainThread {
	Scanner sc = new Scanner(System.in);
	
	public static void showMenu()
	{
		System.out.println("Mời chọn menu:");
		System.out.println("1.Thêm mới bài viết.");
		System.out.println("2.Hiển thị danh sách bài viết.");
		System.out.println("3.Exit");
		System.out.println("---------------------------------");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Article> sbv=new ArrayList<Article>();
		Scanner sc=new Scanner(System.in);
		boolean check = false;
		
		showMenu();
		while(true) {
		int select = new Scanner(System.in).nextInt();
		switch(select)
		{
		case 1:
			int n;
			System.out.println("Nhập số bài viết cần thêm:");
			n = sc.nextInt();
			for (int i = 0; i < n; i++) {
				Article bv=new Article();
				bv.inputInfo();
				sbv.add(bv);
			}
			break;
		case 2:
			for (int i = 0;i<sbv.size(); i++) {
				sbv.get(i).showInfo();;
				
			}
			break;
		case 3:
			System.out.println("Bye bye!!!");
			check = true;
			break;
		default:
			System.err.println("Fault ! Try again.");
			
			break;
		}
		if(check)
		{
			break;
		
		}
		showMenu();
		
		}
	}

}
