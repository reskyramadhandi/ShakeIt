/*
 * Copyright 2017 Phillip Hsu
 *
 * This file is part of ClockPlus.
 *
 * ClockPlus is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * ClockPlus is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with ClockPlus.  If not, see <http://www.gnu.org/licenses/>.
 */

package edu.upi.mobprog18.tubes_1607479_resky_1600872_agung.shakeit.timers.ui;

import android.view.ViewGroup;

import edu.upi.mobprog18.tubes_1607479_resky_1600872_agung.shakeit.timers.data.AsyncTimersTableUpdateHandler;
import edu.upi.mobprog18.tubes_1607479_resky_1600872_agung.shakeit.list.BaseCursorAdapter;
import edu.upi.mobprog18.tubes_1607479_resky_1600872_agung.shakeit.list.OnListItemInteractionListener;
import edu.upi.mobprog18.tubes_1607479_resky_1600872_agung.shakeit.timers.Timer;
import edu.upi.mobprog18.tubes_1607479_resky_1600872_agung.shakeit.timers.data.TimerCursor;
import edu.upi.mobprog18.tubes_1607479_resky_1600872_agung.shakeit.timers.data.AsyncTimersTableUpdateHandler;
import edu.upi.mobprog18.tubes_1607479_resky_1600872_agung.shakeit.timers.data.TimerCursor;

import edu.upi.mobprog18.tubes_1607479_resky_1600872_agung.shakeit.timers.data.AsyncTimersTableUpdateHandler;
import edu.upi.mobprog18.tubes_1607479_resky_1600872_agung.shakeit.timers.data.TimerCursor;

/**
 * Created by Phillip Hsu on 7/29/2016.
 */
public class TimersCursorAdapter extends BaseCursorAdapter<Timer, TimerViewHolder, TimerCursor> {

    private final AsyncTimersTableUpdateHandler mAsyncTimersTableUpdateHandler;

    public TimersCursorAdapter(OnListItemInteractionListener<Timer> listener,
                               AsyncTimersTableUpdateHandler asyncTimersTableUpdateHandler) {
        super(listener);
        mAsyncTimersTableUpdateHandler = asyncTimersTableUpdateHandler;
    }

    @Override
    protected TimerViewHolder onCreateViewHolder(ViewGroup parent, OnListItemInteractionListener<Timer> listener, int viewType) {
        return new TimerViewHolder(parent, listener, mAsyncTimersTableUpdateHandler);
    }


}
