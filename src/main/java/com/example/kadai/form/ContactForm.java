package com.example.kadai.form;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ContactForm {
	@NotBlank(message = "お名前を入力してください。")
	private String name;
	
	@NotBlank(message = "メールアドレスを入力してください。")
	@Email(message = "メールアドレス形式で入力してください。")
	private String email;
	
	@NotBlank(message = "お問い合わせ内容をを入力してください。")
	private String messages;
}
