package com.designs.abstractFactory;

import com.designs.abstractFactory.intfac.Army;
import com.designs.abstractFactory.intfac.Castle;
import com.designs.abstractFactory.intfac.King;
import com.designs.abstractFactory.intfac.KingdomFactory;

/**
 * 抽象工厂模式
 * 适用场景：当产品种类较多，而且对应不同的产品种类有不同的实现方式时，可以使用这种抽象工厂模式来管理不同种类的产品
 * App为该模式的检验类
 * 该类中不需要知道具体的army castle king 是如何实现的
 * 也不需要管kingdomFactory有几个实现类
 * 它只需要知道调用对应的方法能拿到具体的对象即可
 * 而针对army castle king这些接口的多个实现并不会对APP的实际调用产生代码上的变更
 * Created by xinpc on 2019-03-18
 *
 * @desc
 */
public class App {

	public App() {

	}

	public App(KingdomFactory kingdomFactory) {
		setArmy(kingdomFactory.createArmy());
		setCastle(kingdomFactory.createCastle());
		setKing(kingdomFactory.createKing());
	}


	private King king;

	private Castle castle;

	private Army army;

	public King getKing() {
		return king;
	}

	public void setKing(King king) {
		this.king = king;
	}

	public Castle getCastle() {
		return castle;
	}

	public void setCastle(Castle castle) {
		this.castle = castle;
	}

	public Army getArmy() {
		return army;
	}

	public void setArmy(Army army) {
		this.army = army;
	}
}
