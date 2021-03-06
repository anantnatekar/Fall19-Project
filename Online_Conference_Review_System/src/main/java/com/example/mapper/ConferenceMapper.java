package com.example.mapper;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.entity.Paper;
import com.example.entity.Participator;
import com.example.entity.Review;
import com.example.entity.Topics_of_Interest;

@Mapper
public interface ConferenceMapper {

	@Select("SELECT EMAIL,PASSWORD FROM PARTICIPATOR WHERE EMAIL=#{email} and PASSWORD=#{password} ")
	public ArrayList<Participator> verifyParticipator(Participator participator);

	@Insert("insert into participator values (#{email}, #{fname}, #{minit}, #{lname}, #{phone}, #{affiliation}, #{password})")
	public void insertParticipator(Participator participator);

	@Insert("insert into author values (#{email})")
	public void insertAuthor(Participator participator);
	
	@Insert("insert into reviewer values (#{email})")
	public void insertReviewer(Participator participator);

	@Insert("insert into topics_of_interests values (#{email}, #{topic})")
	public void inserTopicsOfInterest(Topics_of_Interest topics);

	@Select("SELECT EMAIL FROM REVIEWER WHERE EMAIL=#{email}")
	public List<String> verifyReviewer(Participator participator);

	@Select("SELECT P.* FROM Paper P WHERE P.paperid=#{id}")
	public Paper getPaper(Paper paper);

	@Select("SELECT ABSTRACT FROM Paper Where paperid=#{id}")
	public String getAbstract(Paper paper);

	@Select("SELECT AVG(overallrecomm) FROM reviews WHERE paperid=#{id} Group by paperid")
	public String getRating(Paper paper);

	@Select("SELECT MAX(paperid) From Paper")
	public int getMaxID();

	@Select("SELECT MIN(paperid) From Paper")
	public int getMinID();
	
	@Select("SELECT * FROM REVIEWS")
	public List<Dashboard> getPaperList();

	@Insert("INSERT INTO Reviews values(#{email},#{id},#{tech},#{readability},#{originality},#{relevance},#{overallRecommendation},#{commentForCom},#{commentForAuth})")
	public void insertReview(Review review);

}
