package jet.ai.llama3local.controller;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.ai.ollama.OllamaChatClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/v1/chat")
@RequiredArgsConstructor
public class ChatController {
  private final OllamaChatClient chatClient;

  @GetMapping
  public Mono<ResponseEntity<String>> generate(
      @RequestParam(defaultValue = "Tell me to add a proper prompt in a funny way") String prompt) {
    return Mono.just(ResponseEntity.ok(chatClient.call(prompt)));
  }
}
