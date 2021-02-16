package com.tts.twitterproject.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Tweet {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    @Column(name = "tweet_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "tweet-id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private User user;
// TODO(): implement tags
//    @ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
//    @JoinTable(name = "tweet_tag", joinColumns = @JoinColumn(name = "tweet_id"),
//    inverseJoinColumns = @JoinColumn(name = "tag_id"))
//    private List<Tag> tags;

    private String message;

    @CreationTimestamp
    private Date createdAt;
}
