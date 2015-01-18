package beeconjartest;

import org.json.JSONException;
import org.json.JSONObject;

import beeconjar.BEECODE;
import beeconjar.Bee;
import beeconjar.BeeCallback;
import beeconjar.HoneyComb;

public class test2 {

    static int uniqueKey = 2015011111;
    
	static Bee watchBee;
	static HoneyComb honeyComb;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		honeyComb = new HoneyComb();
		
		honeyComb.setRegion(BEECODE.DEFAULT);

		BeeCallback beeCallback = new BeeCallback() {
			@Override
			public void onFindBee(Bee bee) {
				// TODO Auto-generated method stub
				super.onFindBee(bee);
				
				if(bee.key==uniqueKey)
				{
					watchBee = bee;								
					honeyComb.clickBee(watchBee.BEECODE, 5);
				}
			}

			@Override
			public void onClickBee(JSONObject jsonObject) {
				// TODO Auto-generated method stub
				super.onClickBee(jsonObject);

				try {
					String BEECODE = jsonObject.getString("BEECODE");
					if(BEECODE.equals(watchBee.BEECODE))
					{
						JSONObject hey = new JSONObject();
						hey.put("lowData", "HI");						
						honeyComb.heyBee(watchBee.BEECODE, hey);						
					}
				} catch (JSONException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}								
			}

			@Override
			public void serverOn() {
				// TODO Auto-generated method stub
				super.serverOn();

			}

			@Override
			public void serverOff() {
				// TODO Auto-generated method stub
				super.serverOff();
			}

			@Override
			public void onNoBee() {
				// TODO Auto-generated method stub
				super.onNoBee();
			}

			@Override
			public void onRecivedBeecode(String BEECODE) {
				// TODO Auto-generated method stub
				super.onRecivedBeecode(BEECODE);
			}
		};

		honeyComb.setBeeCallback(beeCallback);
		honeyComb.hangOn();

	}
}
