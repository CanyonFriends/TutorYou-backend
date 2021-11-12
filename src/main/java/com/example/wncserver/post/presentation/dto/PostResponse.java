package com.example.wncserver.post.presentation.dto;

import com.example.wncserver.post.domain.Post;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class PostResponse {
	private final Long postId;
	private final Long groupId;
	private final String title;
	private final String content;
	private final String userName;
	private final String postType;
	private final String categoryName;
	private final int totalStudentCount;
	private final int applicantCount;
	private final String createdAt;
	private final String updatedAt;
	private final String startDate;
	private final String endDate;

	public static PostResponse from(Post post) {
		return PostResponse.builder()
			.postId(post.getId())
			.groupId(post.getGroup().getId())
			.title(post.getTitle())
			.content(post.getContent())
			.userName(post.getAuthor().getName())
			.postType(post.getPostType().toString())
			.categoryName(post.getCategory().getName())
			.totalStudentCount(post.getTotalStudentCount())
			.applicantCount(post.getGroup().getStudents().size())
			.createdAt(post.getCreatedAt().toString())
			.updatedAt(post.getUpdatedAt().toString())
			.startDate(post.getStartDate().toString())
			.endDate(post.getEndDate().toString())
			.build();
	}
}
