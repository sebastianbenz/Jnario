package org.jnario.doc

import org.eclipse.xtext.xbase.lib.Procedures$Procedure1

class HtmlFile {
	
	def static newHtmlFile(Procedures$Procedure1<HtmlFile> initializer){
		val htmlFile = new HtmlFile()
		initializer.apply(htmlFile)
		return htmlFile
	}
	
	public static HtmlFile EMPTY_FILE = new HtmlFile
	
	public CharSequence fileName = ""
	public CharSequence title = ""
	public CharSequence content = ""
	
	def setTitle(String title){
		this.title = title
	}
	
	def setContent(String content){
		this.content = content
	}
	
	def setFileName(String fileName){
		this.fileName = fileName
	}
	
	def getTitle(){
		return title
	}
	
	def getContent(){
		return content
	}
	
	def getFileName(){
		return content
	}

} 