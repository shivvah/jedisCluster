package jedisCluster;

import redis.clients.jedis.Jedis;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("shuruaat code ki");
		Jedis jedis = new Jedis("10.0.0.12");
		System.out.println("single jedis instance ban gya");
		jedis.set("shivanshu", "superstar");
		System.out.println("key value bhi set ho gyi");
		jedis.close();
		

	}

}
