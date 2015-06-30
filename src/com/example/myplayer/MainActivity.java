package com.example.myplayer;



import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;


public class MainActivity extends Activity {

	// Button b1, b2, b3, b4, b5, b6;
	int serial = 0;
	
	MediaPlayer myPlayer1, myPlayer2, myPlayer3;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		myPlayer1 = MediaPlayer.create(getApplicationContext(),
				R.raw.ashiqi2_sad_guitar);
		myPlayer2 = MediaPlayer.create(getApplicationContext(), 
				R.raw.atifaslam);																																																																																																																																																																																																																																																																																																																																																																																			
		myPlayer3 = MediaPlayer.create(getApplicationContext(),
				R.raw.hiriye_drum);
		try {
			myPlayer1.prepare();
			myPlayer2.prepare();
			myPlayer3.prepare();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	 

	/*public void stopOtherSong(MediaPlayer m1, MediaPlayer m2) {
		if (m1.isPlaying())
		{
			m1.stop();
		}
		if (m2.isPlaying())
		{
			m2.stop();
		}
		//createInstances();
	}

	public void playSong(View v) {
		switch (v.getId()) {
		case R.id.button1:
			serial = 1;
			stopOtherSong(myPlayer2, myPlayer3);
			myPlayer1.start();
			break;

		case R.id.button2:
			serial = 2;
			stopOtherSong(myPlayer1, myPlayer3);
			myPlayer2.start();
			break;

		case R.id.button3:
			serial = 3;
			stopOtherSong(myPlayer1, myPlayer2);
			myPlayer3.start();
			break;
		}
	}

	public void playPauseStop(View v) {
		switch (v.getId()) {
		case R.id.button4:
			switch (serial) {
			case 1:
				myPlayer1.start();
				break;

			case 2:
				myPlayer2.start();
				break;

			case 3:
				myPlayer3.start();
				break;
			}
			break;

		case R.id.button5:
			switch (serial) {
			case 1:
				myPlayer1.pause();
				break;

			case 2:
				myPlayer2.pause();
				break;

			case 3:
				myPlayer3.pause();
				break;
			}
			break;

		case R.id.button6:
			switch (serial) {
			case 1:
				myPlayer1.stop();
				break;

			case 2:
				myPlayer2.stop();
				break;

			case 3:
				myPlayer3.stop();
				break;
			}
			createInstances();
			break;
		}
	}*/

}
