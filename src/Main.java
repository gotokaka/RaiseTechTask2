import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<MobileSuit> mobileSuitList = List.of(new MobileSuit("ガンダム", "白","連邦軍"),
                new MobileSuit("ガンキャノン", "赤","連邦軍"),
                new MobileSuit("ザク", "緑","ジオン公国"),
                new MobileSuit("キュベレイ","ピンク","アクシズ"));

             System.out.println(mobileSuitList.size());

        for (MobileSuit mobileSuit : mobileSuitList) {
            System.out.println("機体の名前：" + mobileSuit.getName());

            System.out.println("機体の色：" + mobileSuit.getColor());
            System.out.println("機体の所属：" + mobileSuit.getForce());
             if (mobileSuit.getForce().equals("連邦軍")) {
                System.out.println("勝ち");
            } else if(mobileSuit.getForce().equals("ジオン公国")){
                System.out.println("負け");
            } else{
                System.out.println("引き分け");
            }

        }
    }
}
