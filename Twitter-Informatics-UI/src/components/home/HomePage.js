/*eslint-disable import/default */
/*eslint-disable import/namespace */

import React from 'react';
import {Link} from 'react-router-dom';
import '../../styles/homepage.css';

class HomePage extends React.Component{

    //class state syntax used below
    state = {
        userName: ''
    };

    //renderUserDetails = this.state.profile.length //finish this

    setUsername = () => {
            if(this.state.userName === ""){
                alert("Enter a username!!");
                return false;
            }
    };

    render(){
        return (
            <div id="searchPage" className="mySearch">
                {/* the input field below is a controlled element*/}
                <input className="myTextBox" 
                    required="required" 
                    type="text" 
                    id="username" 
                    onChange={(event) => {this.setState({userName: event.target.value})}}/>
                <br /><br />
                    <Link to={`user/${this.state.userName}`} className="mySearchButton" onClick={this.setUsername}>Search</Link>
                <br /><br />
            </div>
        );
    }
}

export default HomePage;