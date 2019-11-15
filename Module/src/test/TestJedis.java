package test;

/**
 * @author cb_dream
 * @date 2019/11/15 - 17:43
 */
public class TestJedis {
    public  static void main(Stirng[]  args){
        Jedis jedis=new Jedis ( host : "192.168.80.129" , port: 6379);
        System.out.println(jedis.ping());
        jedis.close();

    }
    private Jeids jedis;

    @Before
}
