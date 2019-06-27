package jedisCluster;

import java.util.HashSet;
import java.util.Set;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisCluster;

public class MainClass {

	public static void main(String[] args) {
		/*
		 * System.out.println("shuruaat code ki"); Jedis jedis = new
		 * Jedis("10.0.0.12"); System.out.println(
		 * "single jedis instance ban gya"); jedis.set("shivanshu",
		 * "superstar"); System.out.println("key value bhi set ho gyi");
		 * jedis.close();
		 */

		System.out.println("program shuruu ho gya maamu");
		Set<HostAndPort> jedisClusterNodes = new HashSet<HostAndPort>();
		jedisClusterNodes.add(new HostAndPort("10.0.0.4", 6379));
		jedisClusterNodes.add(new HostAndPort("10.0.0.12", 6379));

		System.out.println("cluster node set initialised");
		JedisCluster jedis = new JedisCluster(jedisClusterNodes);
		System.out.println("this line is after creation of jedisCluster");

		
		/*
		 * JedisCluster cluster - new JedisCluster(...); ... cluster.set(key,
		 * value);
		 */

	}

}
