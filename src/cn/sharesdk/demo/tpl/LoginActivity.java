package cn.sharesdk.demo.tpl;

import java.util.HashMap;

import com.example.kitchencooking.R;

import cn.sharesdk.tpl.OnLoginListener;
import cn.sharesdk.tpl.ThreeWayLoginActivity;
import cn.sharesdk.tpl.UserInfo;
import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;

/** 中文注释
 * ShareSDK 官网地址 ： http://www.mob.com </br>
 *1、这是用2.38版本的sharesdk，一定注意  </br>
 *2、如果要咨询客服，请加企业QQ 4006852216 </br>
 *3、咨询客服时，请把问题描述清楚，最好附带错误信息截图 </br>
 *4、一般问题，集成文档中都有，请先看看集成文档；减少客服压力，多谢合作  ^_^</br></br></br>
 *
 *The password of demokey.keystore is 123456
 **ShareSDK Official Website ： http://www.mob.com </br>
 *1、Be carefully, this sample use the version of 2.11 sharesdk  </br>
 *2、If you want to ask for help，please add our QQ whose number is 4006852216 </br>
 *3、Please describe detail of the question , if you have the picture of the bugs or the bugs' log ,that is better </br>
 *4、Usually, the answers of some normal questions is exist in our user guard pdf, please read it more carefully,thanks  ^_^
*/
public class LoginActivity extends Activity {
	// 填写从短信SDK应用后台注册得到的APPKEY
	private static String APPKEY = "27fe7909f8e8";
	// 填写从短信SDK应用后台注册得到的APPSECRET
	private static String APPSECRET = "3c5264e7e05b8860a9b98b34506cfa6e";
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		showDemo();
		finish();
	}
	
	private void showDemo() {
		Intent intent = new Intent(this,ThreeWayLoginActivity.class);
		startActivity(intent);
	}
	


	
}
