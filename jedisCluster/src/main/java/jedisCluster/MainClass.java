package jedisCluster;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisShardInfo;
import redis.clients.jedis.ShardedJedis;

public class MainClass {

	public static void main(String[] args) {

		List<JedisShardInfo> shards = new ArrayList<JedisShardInfo>();

	    JedisShardInfo si = null;

	    si = new JedisShardInfo("10.0.0.4", 6379);
	    shards.add(si);
	    si = new JedisShardInfo("10.0.0.12", 6379);
	    shards.add(si);
	    
//integrate in main code
	    //multi threading here using random values
	    //
	    ShardedJedis jedis = new ShardedJedis(shards);
	    System.out.println("pohonche kya shard setup tak????");
	    int i;
	    String key;
	    String value;
	    for(i=0;i<=10;i++){
	    	key=Integer.toString(i+100);
	    	value="constant";
	    	jedis.set(key, value);
	    }
	    	    
	 /*   jedis.set("foo_first", "foo1");
	    jedis.set("foo_secod", "foo2");
	    jedis.set("foo_third", "foo3");
	    jedis.set("foo_fourth", "foo4");
	    jedis.set("foo_fifth", "foo5");
	    jedis.set("foo_sixth", "foo6");*/
	    
	    System.out.println("dekho chaacha keys bhi set kardi");
	    
		
		
		/*
		 * System.out.println("shuruaat code ki"); Jedis jedis = new
		 * Jedis("10.0.0.12"); System.out.println(
		 * "single jedis instance ban gya"); jedis.set("shivanshu",
		 * "superstar"); System.out.println("key value bhi set ho gyi");
		 * jedis.close();
		 */

		/*System.out.println("program shuruu ho gya maamu");
		Set<HostAndPort> jedisClusterNodes = new HashSet<HostAndPort>();
		jedisClusterNodes.add(new HostAndPort("10.0.0.4", 6379));
		//jedisClusterNodes.add(new HostAndPort("10.0.0.12", 6379));
		System.out.println("cluster node set initialised");
		JedisCluster jedis = new JedisCluster(jedisClusterNodes);
		System.out.println("this line is after creation of jedisCluster");
*/
		
		/*
		 * JedisCluster cluster - new JedisCluster(...); ... cluster.set(key,
		 * value);
		 */

	}

}