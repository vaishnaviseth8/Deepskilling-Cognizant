import React from 'react';
import Post from './Post';

export default class Posts extends React.Component {
    constructor(props) {
        super(props);
        this.state = { posts: [] };
    }

    loadPosts() {
        fetch('http://localhost:8080/api/posts')
            .then(res => res.json())
            .then(data => {
                const posts = data.map(p => new Post(p.id, p.title, p.body));
                this.setState({ posts });
            });
    }

    componentDidMount() {
        this.loadPosts();
    }

    componentDidCatch(error, info) {
        alert("Error occurred: " + error);
    }

    render() {
        return (
            <div>
                {this.state.posts.map(post => (
                    <div key={post.id}>
                        <h2>{post.title}</h2>
                        <p>{post.body}</p>
                    </div>
                ))}
            </div>
        );
    }
}
