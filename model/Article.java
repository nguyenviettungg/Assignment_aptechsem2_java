package model;

import java.util.Scanner;

public class Article {
	private String id;
	private String title;
	private String description;
	private int avatar;
	private String content;
	private String author;
	private String date;

	public Article() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Article(String id, String title, String description, int avatar, String content, String author,
			String date) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.avatar = avatar;
		this.content = content;
		this.author = author;
		this.date = date;
	}

	public void inputInfo() {
		Scanner input = new Scanner(System.in);
		System.out.println("nhap ma bai viet: ");
		id = input.nextLine();
		System.out.println("nhap tieu de bai viet: ");
		title = input.nextLine();
		System.out.println("nhap mo ta bai viet: ");
		description = input.nextLine();
		System.out.println("anh dai dien(1-co/0-khong): ");
		avatar = input.nextInt();
		input.nextLine();
		System.out.println("noi dung chinh: ");
		content = input.nextLine();
		System.out.println("ten tac gia: ");
		author = input.nextLine();
		System.out.println("ngay viet: ");
		date = input.nextLine();
	}

	public void showInfo() {
		System.out.println("Article Information: id=" + id + ", title=" + title + ", description=" + description + ", avatar=" + (avatar == 1?"yes":"no")
				+ ", content=" + content + ", author=" + author + ", date=" + date);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getAvatar() {
		return avatar;
	}

	public void setAvatar(int avatar) {
		this.avatar = avatar;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
}
