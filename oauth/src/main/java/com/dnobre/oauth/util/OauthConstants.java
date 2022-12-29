package com.dnobre.oauth.util;

import static com.dnobre.oauth.util.StringUtils.getMensagemPadrao;

public class OauthConstants {

	private OauthConstants() {
		super();
	}

	public static final String RESPONSE_200 = getMensagemPadrao("Operação realizada com sucesso.");
	public static final String RESPONSE_201 = getMensagemPadrao("Recurso criado com sucesso");
	public static final String RESPONSE_204 = getMensagemPadrao("Recurso excluído com sucesso.");

	public static final String RESPONSE_304 = getMensagemPadrao("Recurso não foi modificado.");

	public static final String RESPONSE_400 = getMensagemPadrao("Operação inválida.");
	public static final String RESPONSE_401 = getMensagemPadrao("Operação não autorizada.");
	public static final String RESPONSE_404 = getMensagemPadrao("O recurso não foi encontrado.");

	public static final String RESPONSE_500 = getMensagemPadrao("Erro interno ao realizar operação.");


}
