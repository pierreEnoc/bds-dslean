package com.devsuperior.dslearnbds.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_content")
public class Content extends Lesson {
	private static final long serialVersionUID = 1L;
	
	private String texContent;
	private String videoUri;
	
	public Content() {
		
	}

	public Content(Long id, String title, Integer position, Section section, String texContent, String videoUri) {
		super(id, title, position, section);
		this.texContent = texContent;
		this.videoUri = videoUri;
	}

	public String getTexContent() {
		return texContent;
	}

	public void setTexContent(String texContent) {
		this.texContent = texContent;
	}

	public String getVideoUri() {
		return videoUri;
	}

	public void setVideoUri(String videoUri) {
		this.videoUri = videoUri;
	}

	@Override
	public String toString() {
		return "Content [texContent=" + texContent + ", videoUri=" + videoUri + "]";
	}
	
	
}
