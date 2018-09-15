import React from 'react';
import {Link} from 'react-router';
import axios from 'axios';
import HomeBasicInfo from './homeBasicInfo/HomeBasicInfo';
import HomeMainInfo from './homeMainInfo/HomeMainInfo';
import ProfileData from './mock data/profile.json';

class HomePage extends React.Component{

    constructor(props) {
        super(props);
        this.state = {profile: ProfileData};
    }

    // Uncomment this code when we need to access our rest service
    // componentWillMount() {
    //     axios.get(`http://localhost:8080/profile`)
    //       .then(res => {
    //         const profile = res.data;
    //         this.setState({ profile });
    //       });
    //   }

    render(){
        return (
            <div>
                <div className="split left">
                    {/* No need to use redux store for this */}
                    <HomeBasicInfo profile = {this.state.profile} />
                </div>
                <div className="split right">
                    <HomeMainInfo />
                </div>
            </div>
        );
    }
}

export default HomePage;