package com.enjoylearning.mybatis.factory.real;

import com.enjoylearning.mybatis.factory.product.CangSmallMovie;
import com.enjoylearning.mybatis.factory.product.SmallMovie;

/**
 * 苍老师小电影
 */
public class CangSmallMovieFactory implements SmallMovieFactory {

	@Override
	public SmallMovie createMovie() {
		SmallMovie smallMovie = new CangSmallMovie("cang");
		return smallMovie;
	}

}
