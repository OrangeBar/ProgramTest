package com.lizi.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class BingTestTest {

	@Test
	public void testDriver() throws InterruptedException {
		BingTest bt = new BingTest();
		assertEquals("微软 Bing 搜索 - 国内版", bt.driver().getTitle());
		assertEquals("https://cn.bing.com/", bt.driver().getCurrentUrl());
	}

}
