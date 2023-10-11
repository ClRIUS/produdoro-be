package dev.wakandaacademy.produdoro.area.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Document(collection = "Projeto")
public class Area {
    @Id
    private UUID idProjeto;
    private UUID idUsuario;
    private String nome;
    @Indexed
    private String descricao;
    @Indexed
    private UUID idArea;
}
