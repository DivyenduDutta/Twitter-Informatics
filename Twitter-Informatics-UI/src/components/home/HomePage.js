/*eslint-disable import/default */
/*eslint-disable import/namespace */

import React from 'react';
import {Link} from 'react-router';
import ReactDOM from 'react-dom';
import axios from 'axios';
import ProfileData from './mock data/customProfile.json';
import UserDetailsMain from '../../components/userDetails/userDetailsMain/UserDetailsMain';

class HomePage extends React.Component{

    constructor(props) {
        super(props);
        this.state = {profile: {}};

        this.setUsername = this.setUsername.bind(this);
    }

    setUsername(){
            let userName = document.getElementById("username").value;
            if(userName == ""){
                alert("Enter a username!!");
                return false;
            }
            let request = {"name": userName};
            //console.log(request);
            //Uncomment the axios call in prod, instead of using mock
            /*axios.post(`http://localhost:8080/profile`, request)
                .then(res => {
                const profile = res.data;
                this.setState({ profile });
                //console.log(this.state.profile);
            }); */

            //using mock 
            this.setState({profile:ProfileData }, function(){
                console.log(this.state.profile);
            });
            ReactDOM.render(<UserDetailsMain />, document.getElementById('searchPage'));

    }

    render(){
        return (
            <div id="searchPage" className="mySearch">
                <input className="myTextBox" required="required" type="text" id="username"/><br /><br />
                <button className="btn btn-primary mySearchButton" onClick={this.setUsername}>Search</button>
            </div>
        );
    }
}

export default HomePage;
