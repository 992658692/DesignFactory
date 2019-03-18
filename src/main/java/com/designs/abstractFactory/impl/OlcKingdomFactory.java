package com.designs.abstractFactory.impl;

import com.designs.abstractFactory.intfac.Army;
import com.designs.abstractFactory.intfac.Castle;
import com.designs.abstractFactory.intfac.King;
import com.designs.abstractFactory.intfac.KingdomFactory;

/**
 * Created by xinpc on 2019-03-18
 *
 * @desc
 */
public class OlcKingdomFactory implements KingdomFactory {
	public Army createArmy() {
		return new OlcArmy();
	}

	public Castle createCastle() {
		return new OlcCastle();
	}

	public King createKing() {
		return new OlcKing();
	}
}
