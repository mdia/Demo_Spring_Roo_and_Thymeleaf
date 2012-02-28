package com.arkadias.html5.web;

import com.arkadias.html5.domain.MessageForm;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/messageforms")
@Controller
@RooWebScaffold(path = "messageforms", formBackingObject = MessageForm.class)
public class MessageFormController {
}
