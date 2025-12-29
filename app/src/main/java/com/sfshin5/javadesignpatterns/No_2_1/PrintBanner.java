package com.sfshin5.javadesignpatterns.No_2_1;

// 主人公の役
// 適用される側の役を使って、対象の役を満たす
public class PrintBanner extends Banner implements Print {
    public PrintBanner(String string) {
        super(string);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
    
}
