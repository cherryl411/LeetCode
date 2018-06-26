import org.ansj.domain.Result;
import org.ansj.splitWord.analysis.ToAnalysis;

public class AnsjTest {
    public static void main(String[] args){
        String str = "我需要做一个网站简介。";
        Result words = ToAnalysis.parse(str);
    }
}
