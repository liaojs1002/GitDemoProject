package com.testing.class6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPfindJson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String origin="/**/jQuery110202959951234436733_1570711092066({\"status\":\"0\",\"t\":\"1570711099324\",\"set_cache_time\":\"\",\"data\":[{\"location\":\"美国\",\"titlecont\":\"IP地址查询\",\"origip\":\"3.3.3.3\",\"origipquery\":\"3.3.3.3\",\"showlamp\":\"1\",\"showLikeShare\":1,\"shareImage\":1,\"ExtendedLocation\":\"\",\"OriginQuery\":\"3.3.3.3\",\"tplt\":\"ip\",\"resourceid\":\"6006\",\"fetchkey\":\"3.3.3.3\",\"appinfo\":\"\",\"role_id\":0,\"disp_type\":0}]});";
		System.out.println(origin);
		
		Pattern jsonP=Pattern.compile("\\{(.*)?\\]\\}");
		
		Matcher jsonM=jsonP.matcher(origin);
		
		System.out.println(jsonM.find());
		
		System.out.println(jsonM.group(0));
		System.out.println(jsonM.group(1));
		
	}

}
