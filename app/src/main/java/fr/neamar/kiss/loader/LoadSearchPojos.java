package fr.neamar.kiss.loader;

import java.util.ArrayList;

import android.content.Context;
import fr.neamar.kiss.pojo.SearchPojo;

public class LoadSearchPojos extends LoadPojos<SearchPojo> {

	public LoadSearchPojos(Context context) {
		super(context, "none://");
	}

	@Override
	protected ArrayList<SearchPojo> doInBackground(Void... params) {
		return null;
	}
}
