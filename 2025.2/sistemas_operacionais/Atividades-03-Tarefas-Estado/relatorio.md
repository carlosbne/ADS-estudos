# Relatório da atividade 3 | Estado de Tarefas - Sistemas operacionais

Aluno: Carlos Benigno Neto

Data 10/11/2025 

## Relato

### Introdução
Este relatório apresenta a análise do comportamento de três tarefas escritas em linguagem C (t1, t2 e t3).
As tarefas envolvem operações de entrada/saída (E/S), laços de repetição e instruções de controle simples.

### Atividade 1 - Fatia de Tempo com 1 Tick


| Tick | SO   | t1      | t2      | t3        | Fila de pr |
|------|------|---------|---------|-----------|------------|
| 01   | ex   | --      | --      | --        | --         |
| 02   | ex   | no      | --      | --        | --         |
| 03   | ex   | pr      | no      | --        | t1         |
| 04   | ex   | --      | pr      | no        | t1, t2     |
| 05   | ex t1| --      | --      | pr        | t2, t3     |
| 06   | --   | ex linha 1 | --    | --        | t2, t3     |
| 07   | ex t2| su 1    | --      | --        | t2, t3     |
| 08   | --   | su 2    | ex linha 1 | --      | t3         |
| 09   | ex t3| pr      | su 1    | --        | t1         |
| 10   | --   | --      | su 2    | ex linha 1 | t1        |
| 11   | ex t1| ex linha 2 | --    | pr        | t3         |
| 12   | --   | su 1    | pr      | --        | t2, t3     |

### Atividade 2 - Fatia de Tempo com 10 Ticks


| Tick | SO   | t1      | t2      | t3        | Fila de pr |
|------|------|---------|---------|-----------|------------|
| 01   | ex   | --      | --      | --        | --         |
| 02   | ex   | no      | --      | --        | --         |
| 03   | ex   | pr      | no      | --        | t1         |
| 04   | ex   | --      | pr      | no        | t1, t2     |
| 05   | ex t1| --      | --      | pr        | t2, t3     |
| 06   | --   | ex linha 1 | --    | --        | t2, t3     |
| 07   | --   | su 1    | --      | --        | t2, t3     |
| 08   | --   | su 2    | --      | --        | t2, t3     |
| 09   | ex t2| pr      | ex linha 1 | --      | t1, t3     |
| 10   | --   | --      | su 1    | --        | t1, t3     |
| 11   | --   | --      | su 2    | --        | t1, t3     |
| 12   | ex t3| --      | pr      | ex linha 1 | t1, t2    |

### Atividade 3 - Comparação do Comportamento de t3


A tarefa t3 é diferente das outras porque nunca fica suspensa - ela só aparece como "pronta" ou "executando". Isso acontece porque t3 depende apenas da CPU para funcionar, não precisa esperar por arquivos ou dispositivos externos. Enquanto t1 e t2 ficam paradas esperando operações de arquivo, a t3 fica na fila aproveitando qualquer momento que a CPU fica livre.

 Na Atividade 2 (10 ticks), t3 consegue executar direto quando chega sua vez, terminando mais rápido. Na Atividade 1 (1 tick), ela é interrompida constantemente, mesmo não precisando parar para nada.