public class RGB {
    public static void main(String[] args) {
        short R;
        short G;
        short B;
        for (B = 0; B <= 255; B++) {
            for (G = 0; G<= 255; G++) {
                try {
                    // 太快了终端反应不过来~
                    Thread.sleep(200);
                    for (R = 0; R <= 255; R++ ) {
                        echo(R, G, B);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println();
            }
            System.out.println();
        }
        // 重置终端颜色
        System.out.print("\u001b[0m");
    }


    /**
     * 输出一个带背景色的空格
     * @param r Red   0~255
     * @param g Green 0~255
     * @param b Blue  0~255
     */
    public static void echo(short r, short g, short b) {
        System.out.print("\u001b[48;2;" + r + ";" + g + ";" + b + "m ");
    }
}