import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  public void solution() throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int n = Integer.parseInt(br.readLine());

    for (int i = 0; i < n; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      String output = String.format("Case #%d: %d + %d = %d", i + 1, a, b, a + b);
      sb.append(output).append("\n");
    }
    System.out.println(sb);
  }

  public static void main(String[] args) throws Exception {
    new Main().solution();
  }
}
