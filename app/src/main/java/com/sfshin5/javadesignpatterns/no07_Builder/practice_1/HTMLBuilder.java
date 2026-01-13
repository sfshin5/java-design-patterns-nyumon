package com.sfshin5.javadesignpatterns.no07_Builder.practice_1;

import java.io.*;

// HTMLBuilderはBuilderの役を実装する具体的なクラス
public class HTMLBuilder implements Builder {
    private String filename; //作成するファイル名
    private PrintWriter writer; //ファイルに書き込むためのPrintWriter

    public void makeTitle(String title) { //タイトル作成
        filename = title + ".html"; //タイトルをもとにファイル名を決定
        try {
            writer = new PrintWriter(new FileWriter(filename)); //PrintWriterの作成
        } catch (IOException e) {
            e.printStackTrace();
        }
        writer.println("<html><head><title>" + title + "</title></head><body>");
        //タイトル部分
        writer.println("<h1>" + title + "</h1>");
    }
    public void makeString(String str) { //文字列作成
        writer.println("<p>" + str + "</p>"); //段落<p>として出力
    }
    public void makeItems(String[] items) { //箇条書き作成
        writer.println("<ul>"); //<ul>と<li>で出力
        for (int i = 0; i < items.length; i++) {
            writer.println("<li>" + items[i] + "</li>");
        }
        writer.println("</ul>");
    }
    public void close(){ //文書の完成
        writer.println("</body></html>"); //タグを閉じる
        writer.close(); //ファイルをクローズ
    }
    public String getResult() { //完成した文書
        return filename; //ファイル名を返す　
    }
}